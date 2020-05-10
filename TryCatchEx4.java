class TryCatchEx4{
    public static void main(String args[]) {
        
        try {
            
            try{
                int data[] = new int[5];
                data[6] = 200;
                
            }catch(ArrayIndexOutOfBoundsException ar)
            {
                System.out.println(ar);
            }
            
            int value = 200/0;
            
        }catch(ArithmeticException ae) {
           
            System.out.println(ae);
        }
    }
}