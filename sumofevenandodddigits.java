public int sumofevenandodddigitsum(int input1){
  int temp=0,sum=0,sum1=0;
    if(input2.equals("odd")){
        while(input1>0){
            temp=input1%10;
            if(temp%2!=0){
                sum+=temp;
            }
            input1=input1/10;
        }
        return sum;   
    }
    else{
        while(input1>0){
            temp=input1%10;
            if(temp%2==0){
                sum1+=temp;
            }
            input1=input1/10;
        }
    return sum1;
    }
}
