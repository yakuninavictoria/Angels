public abstract class TheOgre {
    final void Cooking(){
        catchsacrifice();
        fry();
        chat();
        boil();
        eat();
        sleep();
    }
    abstract void fry();
    abstract void chat();
    abstract void boil();
    public void catchsacrifice(){
        System.out.println("Catch the sacrifice");
    }
    public void eat(){
        System.out.println("Eat the cooked sacrifice");
    }
    public void sleep(){
        System.out.println("Go to sleep");
    }
}
