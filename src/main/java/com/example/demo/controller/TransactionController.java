package com.example.demo.controller;

import com.example.demo.model.BarterTransaction;
import com.example.demo.service.TransactionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@Tag(name = "Transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<BarterTransaction> create(@RequestParam Long matchId) {
        return ResponseEntity.ok(transactionService.createTransaction(matchId));
    }

    @GetMapping
    public ResponseEntity<List<BarterTransaction>> getAll() {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BarterTransaction> getById(@PathVariable Long id) {
        return ResponseEntity.ok(transactionService.getTransaction(id));
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<BarterTransaction> complete(
            @PathVariable Long id,
            @RequestParam Integer offererRating,
            @RequestParam Integer requesterRating) {
        return ResponseEntity.ok(
                transactionService.completeTransaction(id, offererRating, requesterRating)
        );
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<BarterTransaction>> getByStatus(
            @PathVariable String status) {
        return ResponseEntity.ok(
                transactionService.getTransactionsByStatus(status)
        );
    }
}
