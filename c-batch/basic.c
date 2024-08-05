int main(){
     int num = 45; //integer
    float f = 5.9; //decimal
    double d = 56.6;
    char c = 'f';
    printf("%1f\n",f); //print float dt
     printf("%5f",d); //print doduble dt
      printf("%c\n",c); //print char dt
      
      //if else revision 
      
      int a = 4; // 4==2
      int b = 2;
      int c = 2; //2==4
      if(a==b){ //false
        if(b==c){ // 4==5
          printf("Our Traingle is Equlilateral");
          
        }else{
           printf("Our triangle is isocles");
          
        }
      }else if(b==c){
        printf("Our triangle is isocles");
        
      
      }else if(c==a){
       printf("Our triangle is isocles");
        
      }else{
        printf("Our triangle is scelene");
      }
      
     
     
     int table = 4;
     int a = 3;
     int b = 6;
     int c = a+b;
     for(int i =1;i<=10;i++){
       int print = table*i;
       printf("%d\n",table*i);
     }
     
     //print sum of all even numbers
    // printf("Enter number for you want to get sums");
     int num = 0; //10
     
     scanf("%d",&num);
    
     int sum = 0;
    for(int i =1;i<=num;i++{
      if(i%2==0){
        sum = sum+i;
        
      }
    }
    printf("%d",sum);
    
    for(int i =1;i<=5;i++){ //outer loop
      for(int j =1;j<=i;j++){ //inner loop
        printf("*"); //start print
      }
      printf("\n"); //line change
    }
     
    
}