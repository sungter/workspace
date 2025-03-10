import React from "react";

const List = ({titleList, setIsShow, setListObject}) => {

  return (
    <>
      <table className="mainList">
        <thead>
          <tr>
            <td>NO</td>
            <td>제목</td>
            <td>작성자</td>
            <td>조회수</td>
          </tr>
        </thead>

        <tbody>
          {
            titleList.map((list, i) => {
              return(
                <tr key={i}>
                  <td>{list.num}</td>
                  <td className="clickEvent" onClick={(e) => {
                    setIsShow(true)
                    setListObject(list)
                  }}>{list.title}</td>
                  <td>{list.writer}</td>
                  <td>{list.views}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  );
};

export default List;
