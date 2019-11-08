class Test {
    public void foo() {
        Something x;
        Object b = getSth();
        if(x.condition()){
            b = doSth(b);
        }
        x.useProcessedArg(processFurther(b));
    }
}
