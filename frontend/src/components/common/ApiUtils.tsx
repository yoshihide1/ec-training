import axios, { AxiosResponse } from "axios";

export const getRequest = <T,>(url: string, callback: (res: T) => void) => {
  axios
    .get(url)
    .then((res: AxiosResponse) => callback(res.data))
    .catch((error) => {
      console.error("Error:", error);
    });
};

export const postRequest = <T, T2>(
  url: string,
  callback: (data: T2) => void,
  params?: T
) => {
  axios
    .post(url, params)
    .then((res: AxiosResponse) => {
      console.log("success:", res);
      callback(res.data);
    })
    .catch((error) => {
      console.error("Error: ", error);
    });
};

export const deleteRequest = <T,>(url: string, callback: (res: T) => void) => {
  axios
    .delete(url)
    .then((res: AxiosResponse) => {
      console.log("success:", res);
      callback(res.data);
    })
    .catch((error) => {
      console.error("Error: ", error);
    });
};
