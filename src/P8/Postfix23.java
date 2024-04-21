package P8;

public class Postfix23 {
    char[] stack;
    int size, top;

    public Postfix23(int size){
        this.size = size;
        stack = new char[size];
        top = -1;
        push('(');
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperator(char c){
        if(c == '^' || c == '%' || c == '/' || c == '*' || c == '+' || c == '-'){
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c){
        switch(c){
            case '^':
            return 3;

            case '/':
            return 2;

            case '*':
            return 2;

            case '%':
            return 2;

            case '-':
            return 1;

            case '+':
            return 1;

            default:
            return 0;
        }
    }

    public String konversi(String q){
        String p = "";
        char c;
        for (int i =0; i < size; i++){
            c = q.charAt(i);
            if (isOperand(c)){
                p += c;
            }

            if (c == '('){
                push(c);
            }

            if (c == ')'){
                while(stack[top] != '('){
                    p += pop();
                }

                pop();
            }
            
            if(isOperator(c)){
                while (derajat(stack[top]) >= derajat(c)){
                    p += pop();
                }
                push(c);
            }
        }
        return p;
    }
}
