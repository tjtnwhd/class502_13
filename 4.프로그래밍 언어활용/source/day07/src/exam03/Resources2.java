package exam03;

    public class Resources2 implements AutoCloseable{
        // AutoCloseable : 기준
        @Override
        public void close() throws Exception {
            System.out.println("Resources2 =자원해제!");
        }
    }


