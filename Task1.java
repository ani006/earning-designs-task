class Task1 {
    public static void main(String[] args) {
    String str="C4B3e5";// input variable
    String result=""; 
    for(int i=1;i<str.length();i=i+2){
        char ch=str.charAt(i-1);
        int n=Character.getNumericValue(str.charAt(i));
        for(int j=0;j<n;j++)
        {
            result=result+""+ch;
        }
    }
    System.out.println(result);
    }
}