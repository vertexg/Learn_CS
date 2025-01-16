import array


def append(self, value, int):
  if(self.length == self.capacity):
    self.resize()

    self,array[self.length] = value
    self.length += 1

def resize(self):
  self.capacity = 2 * self.capacity
  newArray = [0] * self.capacity
  for i in range(self.length):
    newArray[i] = self.array[i]
  self.array = newArray

  print(self.array)
