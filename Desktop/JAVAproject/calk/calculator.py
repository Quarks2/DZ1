import logging

class ComplexCalculator:

    def __init__(self, operation):
        self.operation = operation

    def execute(self, a, b):
        return self.operation.execute(a, b)
