package org.abstractica.javablocks.basic;

public interface PullBlock<From, To> extends Input<To>
{
    public void setInput(Input<From> input);
}
