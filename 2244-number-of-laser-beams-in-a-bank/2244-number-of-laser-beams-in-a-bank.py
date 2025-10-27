class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        prev = bank[0].count("1")
        res =0
        for i in range(1,len(bank)):
            cur = bank[i].count("1")
            if cur:
                res+= (cur *prev)
                prev = cur

        return res        
        