package stos_rpn;

public class RPN {
    private int result;
    private String user_input;
    private String[] StrArray;
    private Stack stack = new Stack();
    public void SetUserInput(String input){
        this.user_input = input;
    }
    public void ConvertToArray(){
        StrArray = user_input.split(" ");
    }
    public String Add(String var1,String var2){
        return String.valueOf(Integer.parseInt(var1)+Integer.parseInt(var2));
    }
    public String Substract(String var1, String var2){
        return String.valueOf(Integer.parseInt(var1)-Integer.parseInt(var2));
    }
    public String Multiply(String var1,String var2){
        return String.valueOf(Integer.parseInt(var1)*Integer.parseInt(var2));
    }
    public int SetResultFromStack(){
        return this.result = Integer.parseInt(stack.peek());
    }
    public void Calculate(){
        int length = StrArray.length;
        int iteration = 0;
        String temp_var1,temp_var2;
        while (iteration < length){
            if (StrArray[iteration].charAt(0) == '+'){
                temp_var2 = stack.pop();
                temp_var1 = stack.pop();
                stack.push(Add(temp_var1,temp_var2));
            }
            else if(StrArray[iteration].charAt(0)  == '-'){
                temp_var2 = stack.pop();
                temp_var1 = stack.pop();
                stack.push(Substract(temp_var1, temp_var2));
            }
            else if(StrArray[iteration].charAt(0)  == '*'){
                temp_var2 = stack.pop();
                temp_var1 = stack.pop();
                stack.push(Multiply(temp_var1, temp_var2));
            }
            else{
                stack.push(""+StrArray[iteration] );
            }
            iteration += 1;
        }
    }
    public int getResult(){
        return this.result;
    }
}
