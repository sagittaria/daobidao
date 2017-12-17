package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class FakeSpittleRepository implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list=new ArrayList<Spittle>();
        list.add(new Spittle("spittle 1", new Date()));
        return list;
    }

    public Spittle findOne(long spittleId) {
        return new Spittle("spittle 5", new Date());
    }
}
