package com.example.myfinance.model;

import java.util.LinkedList;

public class Conta {

    private double saldoTotal;
    private double totalDespesas;
    private double totalReceitas;


    public Conta(double saldoTotal, double totalDespesas, double totalReceitas) {
        this.saldoTotal = 0.0;
        this.totalDespesas = 0.0;
        this.totalReceitas = 0.0;
    }


    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public double getTotalReceitas() {
        return totalReceitas;
    }

    public void setTotalReceitas(double totalReceitas) {
        this.totalReceitas = totalReceitas;
    }

}
