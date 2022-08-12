package org.abstractica.javablocks.basic.impl;

import org.abstractica.javablocks.basic.Input;
import org.abstractica.javablocks.basic.InterruptableFunction;
import org.abstractica.javablocks.basic.PullBlock;

class InterruptablePullBlockImpl<From, To> implements PullBlock<From, To>
{
    private final InterruptableFunction<From, To> fun;
    private Input<From> input;

    public InterruptablePullBlockImpl(InterruptableFunction<From, To> fun)
    {
        this.fun = fun;
    }

    @Override
    public void setInput(Input<From> input)
    {
        this.input = input;
    }

    @Override
    public To get() throws InterruptedException
    {
        if(input == null)
        {
            throw new IllegalStateException("PullBlock's input is null!");
        }
        return fun.apply(input.get());
    }
}
