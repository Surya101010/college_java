public int totalhill(int input1,int input2,int input3){    
    int temp=0;
    int t=0;
    for(int i=0;i<input1;i++){
        temp=input2 + input3*i;
        t+=temp*(i+1);
    }
        return t;
    }
