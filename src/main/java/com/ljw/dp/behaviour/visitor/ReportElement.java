package com.ljw.dp.behaviour.visitor;

public interface ReportElement {
    <R> R accept(ReportVisitor<R> visitor);
}
