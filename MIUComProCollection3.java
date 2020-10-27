/* this code's are writen and compiled by Tadesse Alemayehu 
- for any question you might have you can drop it on my email "tadAlem26@gmail.com"
- or contact me a@ 
        akypee "adesu.alemayehu1" 
        telegram "@jaBrainiac" 
        twitter "@AddisuAlemayeh8"
        website "https://winmacsoul.com/"
        phone "+251921577930"
*/
// part three with 30 functions 

package miu.compro.collection.pkg3;


public class MIUComProCollection3 {

    public static void main(String[] args) {
        MIUComProCollection3 mainObject=new MIUComProCollection3();
//        System.out.println(mainObject.isMeera(new int[]{3, 5, -2}));
//        System.out.println(mainObject.isMeera(2));
//        System.out.println(mainObject.isBunker(new int[]{7, 6, 10, 1}));
//        System.out.println(mainObject.isNice(new int[]{3, 4, 5, 7}));
//        System.out.println(mainObject.isContinuousFactored(90));
//        System.out.println(mainObject.isSetEqual(new int[]{1, 9, 12},new int[]{9, 1, 12, 1}));
//        System.out.println(mainObject.isSmart(16));
//        System.out.println(mainObject.isNiceArray(new int[]{8, 5, -5, 5, 3}));
//        System.out.println(mainObject.isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
//        System.out.println(mainObject.factorEqual(10,33));





//        System.out.println(mainObject.isMeera2(new int[]{-4, 0, 1, 0, 2, 1}));
//        System.out.println(mainObject.isFibonacci2(18));
//        System.out.println(mainObject.isMeera3(new int[]{6, 10, 1}));
//        System.out.println(mainObject.isBean(new int[]{0, -1, 1}));
//        System.out.println(mainObject.isFancy(61));
//        System.out.println(mainObject.isMeera4(new int[]{7, 6, 1}));
//        System.out.println(mainObject.isBean2(new int[]{7, 7, 3, 6}));
//        System.out.println(mainObject.isBunker2(29));
//        System.out.println(mainObject.isDual(new int[]{1, 2, 1, 3, 3, 2}));
//        System.out.println(mainObject.isDual2(new int[]{1, 2, 2, 1, 3, 0}));




//        System.out.println(mainObject.factorTwoCount(48));
//        System.out.println(mainObject.isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));
//        System.out.println(mainObject.goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));isWave2
//        System.out.println(mainObject.sumDigits(3114));
//        System.out.println(mainObject.isGuthrie(11));
//        System.out.println(mainObject.minDistance2(1));
//        System.out.println(mainObject.isWave2(new int[]{2, 6, 3, 4}));
//        System.out.println(mainObject.minDistance3(1));
//        System.out.println(mainObject.isHollow3(new int[]{1,1,1,1,0,0,0,2,1,2,18}));
    }
    
int isMeera(int [ ] a){
for(int i=0;i<a.length;i++){
    int n=a[i];
    for(int k=0;k<a.length;k++){
        if(a[k]==2*n)
            return 0;
    }
}
return 1;
}

//

int isMeera(int n){
int count=0;
for(int i=2;i<n;i++){
     if(n%i==0)
        count++;
}
if(count==0||n%count!=0)
    return 0;
else 
    return 1;
}

//
int isPrime(int n){
    for(int i=2;i<n;i++){
        if(n%i==0)
            return 0;
    }
return n>1? 1:0;
}
int isBunker(int [ ] a){
boolean prime=false,one=false;
for(int i=0;i<a.length;i++){
    if(a[i]==1)
        one=true;
    else if(isPrime(a[i])==1)
        prime=true;
    if(prime&&one)
        return 1;
}
if(!prime&&!one)
    return 1;
else 
    return 0;
}

//

int isNice(int[ ] a){
    outerLoop:for(int i=0;i<a.length;i++){
    for(int J=0;J<a.length;J++){
        if(a[J]==(a[i]-1)||a[J]==(a[i]+1))
            continue outerLoop;
    }
    return 0;
}
return 1;
}


//


int isContinuousFactored(int n){
int arraySize=0;
for(int i=2;i<n;i++){
 if(n%i==0)
        arraySize++;
}
 int[] rep=new int[arraySize];
int index=0; 
for(int i=2;i<n;i++){
    if(n%i==0){
        rep[index]=i;
        int product=1;
        for(int j=index;j>=0;j--){
            product*=rep[j];
            if(product==n)
                return 1;
            else if(j==0||rep[j-1]!=(rep[j]-1))// exit the loop if the next is element not a continues factor
                break;
        }
         index++;
    }
}
return 0;
}


//


int isSetEqual(int[ ] a, int[ ] b){
    outerLoop:for(int i=0;i<a.length;i++){
    for(int k=0;k<b.length;k++){
        if(a[i]==b[k])
            continue outerLoop;
    }
    return 0;
}
    outerLoop:for(int i=0;i<b.length;i++){
    for(int k=0;k<a.length;k++){
        if(b[i]==a[k])
            continue outerLoop;
    }
    return 0;
}
return 1;
}


//


int isSmart(int n){
int smart=1;
for(int i=0;smart<n;i++){
    smart+=i;
}
if(smart==n)
    return 1;
else 
    return 0;
}


//


int isNiceArray (int[ ] a){
int sum=0;
for(int i=0;i<a.length;i++){
    if(a[i]<0)
        continue;
    if(isPrime(a[i])==1)
        sum+=a[i];
}
if(a.length<1||sum!=a[0])
    return 0;
else 
    return 1;
}


//


int isComplete (int[ ] a){
    int maxE=-1;
for(int i=0;i<a.length;i++){
    if(a[i]<=0)
        return 0;
    else if(a[i]%2==0&&maxE==-1)
        maxE=i;
    else if(a[i]%2==0&&a[i]>a[maxE])
        maxE=i;
}
outerLoop:for(int i=a[maxE];i>0;i-=2){
    for(int k=0;k<a.length;k++){
        if(a[k]==i)
            continue outerLoop;
    }
    return 0;
}
return 1;
}

//


int factorEqual(int n, int m){
    int max=n>m? n:m;
    int countn=0,countm=0;
    for(int i=2;i<=max;i++){
        if(n%i==0)
            countn++;
        if(m%i==0)
            countm++;
    }
if(countn==countm)
    return 1;
else 
    return 0;
}


//


int isMeera2 (int[ ] a){
int sum=0;
for(int i=0;i<a.length;i++){
    if(a[i]>=i)
        return 0;
    sum+=a[i];
}
if(sum==0)
    return 1;
else 
    return 0;
            
}


//


int isFibonacci2 (int n){
int pp=1,mm=1,fab=0;
for(int k=1;k<n&&fab<n;k++){
    fab=pp+mm;
    pp=mm;
    mm=fab;
}
if(n==fab)
    return 1;
else 
    return 0;
}


//


int isMeera3(int [ ] a){
boolean prime=false,zero=false;
for(int i=0;i<a.length;i++){
    if(a[i]==0)
        zero=true;
    if(isPrime(a[i])==1)
        prime=true;
    if(prime&&zero)
        return 1;
}
if(((!prime)&&zero)||prime&&(!zero)){

    System.out.println(" this ");
    return 0;
}
else 
    return 1;
}


//


int isBean(int[ ] a){
    outerLoop:for(int i=0;i<a.length;i++){
    for(int k=0;k<a.length;k++){
        if(a[k]==(a[i]-1)||a[k]==(a[i]+1))
            continue outerLoop;
    }
    return 0;
}
    return 1;
}


//


int isFancy(int n){
    int n1=1,n2=1,n3=1;
    for(;n3<n;){
        int temp=n3;
        n3=(n2*2)+(n3*3);
        n2=temp;
    }
    if(n3==n)
        return 1;
    else 
        return 0;
}


//


int isMeera4(int [ ] a){
boolean nine=false,one=false;
for(int i=0;i<a.length;i++){
    if(a[i]==1)
        one=true;
    else if(a[i]==9)
        nine=true;
    if(nine&&one)
        return 1;
}
if((!nine)&&(!one))
    return 1;
else return 0;
}


//


int isBean2(int[ ] a){
    outerLoop:for(int i=0;i<a.length;i++){
        for(int k=0;k<a.length;k++){
            if(a[k]==(2*a[i])||a[k]==(2*a[i]+1)||a[k]==(a[i]/2))
                continue outerLoop;
        }
        return 0;
    }
return 1;
}


//


int isBunker2(int n){
int banck=1;
for(int i=0;i<n&&banck<n;i++){
    banck+=i;
}
if(banck==n)
    return 1;
else 
    return 0;
}


//


int isDual(int[ ] a){
for(int i=0;i<a.length;i++){
    int count=0;
    for(int k=0;k<a.length;k++){
        if(a[k]==a[i])
            count++;
    }
    if(count!=2)
        return 0;
}
return 1;
}


//


int isDual2(int[ ] a){
if(a.length%2!=0||a.length<2)
    return 0;
int sum=a[0]+a[1];
for(int i=2;i<a.length;i+=2){
    if(sum!=(a[i]+a[i+1]))
        return 0;
}
return 1;
}


//


int factorTwoCount(int n){
    int i=0;
    for(;n>0;i++,n/=2){
        if(n%2!=0)
            return i;
    }
    return i;
}


//


int isDaphne (int[ ] a){
int endOne=0,beginOne=0;
boolean beginEven=true,endEven=true,odd=false;
int i=0,J=a.length-1;
for(;i<J&&J>i;J--,i++){
    if(a[i]%2==0&&beginEven)
        beginOne++;
    if(a[J]%2==0&&endEven)
        endOne++;
    if(a[i]%2!=0){
        odd=true;
        beginEven=false;
    }
    if(a[J]%2!=0){
        odd=true;
        endEven=false;
    }
    if((!beginEven)&&(!endEven))
        break;
        
}
if(beginOne==endOne&&odd)
    return 1;
else 
    return 0;
}


//


int goodSpread (int[ ] a){
    for(int i=0;i<a.length;i++){
        int count=0;
        for(int k=0;k<a.length;k++){
            if(a[k]==a[i])
                count++;
        }
        if(count>3)
            return 0;
    }
    return 1;
}


//


int sumDigits (int n){
int sum=0;
for(;n>0;n/=10){
    sum+=(n%10);
}
return sum;
}


//


int isGuthrie (int n){
    
    int num=1;
for(int i=0;i<n&&num<n;i++)
    num+=i;
if(num==n)
    return 1;
else 
    return 0;
}


//


int minDistance2(int n){
int f=1,pf=1,diff=n-1;
for(int i=2;i<n&&diff!=1;i++){
    if(n%i==0){
        pf=f;
        f=i;
        if((f-pf)<diff){
            diff=f-pf;
        }
    }
}
return diff;
}


//


int isWave2(int [ ] a){
boolean odd=a[0]%2!=0? true:false;
for(int i=0;i<a.length;i++){
    if(odd){
        if(a[i]%2==0)
            return 0;
    }
    else {
        if(a[i]%2!=0)
            return 0;
    }
    odd=(!odd);
}
return 1;
}

//


int minDistance3(int n){
int diff=n-1,pf=1,f=1;
for(int i=2;i<n&&diff>1;i++){
if(n%i==0){
	pf=f;
	f=i;
	if((f-pf)<diff){
	diff=f-pf;
}
}
}

return diff;
}


//


int isHollow3(int[ ] a){
int countZ=0,beginOne=0,endOne=0;
int i=0;
for(;i<a.length&&a[i]!=0;i++)
	beginOne++;
for(;i<a.length&&a[i]==0;i++){
countZ++;
}
for(;i<a.length&&a[i]!=0;i++)
{endOne++;}

if(endOne==beginOne&&countZ>2)
return 1;
else 
    return 0;
}
}
