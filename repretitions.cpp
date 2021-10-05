#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main()
{   
    string s;
    cin>>s;
    int n=s.length(),count=0,ans=0;
    char temp=s[0];
    for(int i=1;i<n;i++)
    {
       if(s[i]==temp){
       count++;
       ans=max(ans,count);
       }
       else{
       count=0;
       temp=s[i];
       }

      

    }
    cout<<ans+1;

    return 0;
}