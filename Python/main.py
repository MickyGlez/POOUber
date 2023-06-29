from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car("32FDFD", Account("Andres Herrera", "FE323"))
    print(vars(car))
    print(vars(car.driver))