package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarDaoImp implements CarDao {
   private static final List<Car> cars = new ArrayList<>();

   {
      cars.add(new Car(1,"bmw", 101));
      cars.add(new Car(2,"vw", 102));
      cars.add(new Car(3,"toyota", 103));
      cars.add(new Car(4,"lada", 104));
      cars.add(new Car(5,"opel", 105));
   }

   @Override
   public List<Car> getCars(int count) {
      if (count == 0) {
         return cars;
      }
      return cars.stream().limit(count).collect(Collectors.toList());
   }
}

