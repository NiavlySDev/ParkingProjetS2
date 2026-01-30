/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lml.snir.parkinglogickit.metier.transactionel;

import java.util.List;
import lml.snir.parkinglogickit.metier.entity.Car;

/**
 *
 * @author Viralu
 */
public interface CarService {
    
    public Car getByContent(String contenu) throws Exception;
    public List<Car> getByAssociate(boolean attribue) throws Exception;
}
