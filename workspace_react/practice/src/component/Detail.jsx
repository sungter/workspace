import React from "react";

const Detail = ({ isShow, listObject }) => {
  return (
    <>
      {isShow ? (
        <table className="showInfo">
          <tbody>
            <tr className="darkArea">
              <td>글번호</td>
              <td>{listObject.num}</td>
              <td>작성자</td>
              <td>{listObject.writer}</td>
            </tr>

            <tr className="darkArea">
              <td>글제목</td>
              <td>{listObject.title}</td>
              <td>조회수</td>
              <td>{listObject.views}</td>
            </tr>

            <tr className="darkArea">
              <td>글내용</td>
              <td colSpan={3}>{listObject.boardInfo}</td>
            </tr>
          </tbody>
        </table>
      ) : (
        ""
      )}
    </>
  );
};

export default Detail;
