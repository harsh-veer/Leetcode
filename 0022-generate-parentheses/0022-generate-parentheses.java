class Solution {
    void solve(int n,int open,int close,String ans,List<String> res)
    {
        //base case
        if(open==n && close==n)
        {
            res.add(ans);
            return;
        }
        if(open>n || close>open)
        {
            return;
        }
        solve(n,open+1,close,ans+"(",res);
        solve(n,open,close+1,ans+")",res);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();//output
        String ans="";
        solve(n,0,0,ans,res);
        return res;

        
    }
}