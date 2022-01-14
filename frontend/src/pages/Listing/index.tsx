import axios from "axios";
import Card from "components/Card";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";

function Listing() {
  //forma errada
  axios.get(`${BASE_URL}/filmes?size=12&page=0`).then((response) => {
    console.log(response.data);
  });

  return (
    <>
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
