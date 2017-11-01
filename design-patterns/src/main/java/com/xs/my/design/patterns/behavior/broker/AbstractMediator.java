package com.xs.my.design.patterns.behavior.broker;
/**
 * 抽象中介者
 */
public abstract class AbstractMediator {
    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }
    //a影响B
    public abstract void AaffectB();

    //B影响a
    public abstract void BaffectA();

}
