package lml.snir.parkinglogickit.metier.transactionel;

import java.util.List;
import lml.snir.parkinglogickit.metier.entity.Badge;
import lml.snir.persistence.CrudService;

/**
 *
 * @author phily
 */
public interface BadgeService extends CrudService<Badge> {

    public Badge getById(long id) throws Exception;

    public Badge getByContent(boolean attribue) throws Exception;
}
