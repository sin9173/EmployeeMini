package hr.emp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseResult { //응답코드, 메세지

    SUCCESS(0, "성공"),
    DATA_NOT_FOUND(40401, "데이터가 없습니다.");

    private int code;

    private String message;
}
