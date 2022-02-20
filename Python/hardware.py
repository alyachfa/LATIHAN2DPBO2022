from statistics import mode
from product import product

class hardware(product):
    __brand = ""
    __model = ""

    def __init__(self, brand = "", model = ""):
        self.__brand = brand
        self.__model = model
    
    def setBrand(self, brand):
        self.__brand = brand
    
    def getBrand(self):
        return self.__brand

    def setModel(self, model):
        self.__model = model

    def getModel(self):
        return self.__model