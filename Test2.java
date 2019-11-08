class Test2 {
    public void foo() {
        x = null;
        foo();
        if(bar()){
          x.baz();
        }
    }
}
