package part1.q9;

class Kangaroo {
    public void hop() {}
}

class Joey extends Kangaroo {
    // INSERT CODE HERE
    //public void hop() {}
    //public void hop() throws Exception {}
    //public void hop() throws IOException {}
    @Override
    public void hop() throws RuntimeException {}
}
