export type Movie = {
    id: number;
    titulo: string;
    pontuacao: number;
    count: number;
    imagem: string;
}

export type MoviePage = {
    content: Movie[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}