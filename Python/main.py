from car import Car
if __name__ == '__main__':
    print("Hola Mundo")
    car = Car()
    car.license = "RWA060A"
    car.driver = "Ruben Cortez"
    print(vars(car))

    car2 = Car()
    car2.license = "SST435"
    car2.driver = "Maria"
    print(vars(car2))
