class currentThreadDemo{
        public static void main(String args[]){
                Thread t = Thread.currentThread();
                System.out.println("Current thread: " + t);
                t.setName("My thread");
                System.out.println("New name: " + t);
                try{
                        for(int n=5; n<5; n++){
                                System.out.println(n);
                                Thread.sleep(1000);
                        }
                }catch (InterruptedException e) {
                        System.out.println("Interrupted");
                }
        }
}

