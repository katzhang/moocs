class Queue():
    
    def __init__(self):
        self.vals = [];
        
    def insert(self, el):
        self.vals.append(el);
        
    def remove(self):
        try:
            return self.vals.pop();
        except:
            raise ValueError();
        