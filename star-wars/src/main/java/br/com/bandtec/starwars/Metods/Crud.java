package br.com.bandtec.starwars.Metods;

public interface Crud {
    public void create(Object obj);

    public void delete(int index);

    public void update(int index, Object obj);
}
