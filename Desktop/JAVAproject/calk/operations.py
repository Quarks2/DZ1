from abc import ABC, abstractmethod

class Operation(ABC):

    @abstractmethod
    def execute(self, a, b):
        pass

class AdditionOperation(Operation):
    
    def execute(self, a, b):
        return a + b

class MultiplicationOperation(Operation):
    
    def execute(self, a, b):
        return a * b

class DivisionOperation(Operation):
    
    def execute(self, a, b):
        return a / b
