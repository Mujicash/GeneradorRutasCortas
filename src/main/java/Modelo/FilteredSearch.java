package Modelo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Andre Mujica
 **/
public class FilteredSearch<T extends SearchFilter> {

    public List<T> find(@NotNull List<T> elements, String name) {
        Iterator<T> it = elements.iterator();
        List<T> matches = new ArrayList<>();

        while (it.hasNext()) {
            T i = it.next();

            if(i.matcher(name)) {
                matches.add(i);
            }
        }

        return matches;
    }
}
