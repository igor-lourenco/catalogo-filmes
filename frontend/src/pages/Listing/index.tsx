import axios from "axios";
import Card from "components/Card";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";

function Listing() {
  //Manter estado no componente
  const [pageNumber, setPageNumer] = useState(0);

  const [page, setPage] = useState<MoviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true,
  });

  //Executar algo na instanciação ou destruição do componente, observar estado
  useEffect(() => {
    axios
      .get(`${BASE_URL}/filmes?size=12&page=${pageNumber}`)
      .then((response) => {
        const data = response.data as MoviePage; //pega o corpo da resposta
        setPage(data);
      });
  }, [pageNumber]);

  //função para recarregar o estado da pagina com o numero da pagina vindo como parmetro
  const handlePageChange = (newPageNumber: number) => {
    setPageNumer(newPageNumber);
  }

  return (
    <>
      <Pagination page={page} onChange={handlePageChange} />
      <div className="container">
        <div className="row">
          {page.content.map((movie) => (
            <div key={movie.id} className="col-sm-6 col-lg-4 col-xl-3">
              <Card movie={movie} />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Listing;
