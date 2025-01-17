from typing import Any


def __init__(self):
        self.stack = []
def push(self, value):
        self.apend(value)
def pop(self) -> Any:
        if not self.is_empty():
            return self.stack.pop()
        else:
              raise IndexError
def peek(self) -> Any:
       if not self.is_empty():
           return self.stack[-1]
       else:
           raise IndexError
def empty(self) -> bool:
        return not self.stack

def size(self) -> int:
    return len(self.stack)
