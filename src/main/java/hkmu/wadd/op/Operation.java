package hkmu.wadd.op;

public interface Operation {
    long operate(long op1, long op2);
    String getOpsName();
}