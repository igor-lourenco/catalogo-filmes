import axios from "axios";
import Card from "components/Card";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";

function Listing() {
  
  const [pageNumber, setPageNumer] = useState(0);

  useEffect(() => {
    axios.get(`${BASE_URL}/filmes?size=12&page=1`).then((response) => {
      const data = response.data as MoviePage;
      console.log(data);
      setPageNumer(data.number);
    });
  }, []);

  /*FORMA ERRADA
  axios.get(`${BASE_URL}/filmes?size=12&page=1`).then((response) => {
    const data = response.data as MoviePage
    setPageNumer(data.number);
  });
  */

  return (
    <>
      <p>{pageNumber}</p>
      <Pagination />
      <div className="container">
        <div className="row">
          <div className="col-sm-6 col-lg-4 col-xl-3">
            <Card />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3">
            <Card />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3">
            <Card />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3">
            <Card />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3">
            <Card />
          </div>
        </div>
      </div>
    </>
  );
}

export default Listing;
