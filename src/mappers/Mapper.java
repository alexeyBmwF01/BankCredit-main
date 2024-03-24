package mappers;

public  interface Mapper<M,D> {
    D  fromModelToDTO(M model);
    M fromDTOtoModel(D dto);
}
