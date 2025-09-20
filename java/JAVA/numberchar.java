class numberchar {
    public static void main(String[] args) {
        String a ="a4b5c6d7e10";
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            i++;
            int sum=0;
            while(i<a.length() && Character.isDigit(a.charAt(i))){
                sum = sum * 10 + (a.charAt(i) - '0');
                i++;
            }
            for(int j=0;j<sum;j++){
                System.out.print(c);
            }
            i--; 
        }
    }
    
}
