package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }

    public Optional<Expense> getExpenseById(Long id) {
        return repository.findById(id);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    public List<Expense> getExpensesByCategory(String category) {
        return repository.findByCategory(category);
    }
}
