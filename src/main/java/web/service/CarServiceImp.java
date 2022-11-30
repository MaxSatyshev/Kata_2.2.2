package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService{
    CarDao carDao = new CarDaoImp();
    {
        carDao.add(new Car("bmw", 123, "Sergey"));
        carDao.add(new Car("mercedes", 228, "Max"));
        carDao.add(new Car("lamborginy", 69, "Vanya"));
        carDao.add(new Car("bmw", 940, "Bogdan"));
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> severalCars(int several) {
        return carDao.severalCars(several);
    }
}
