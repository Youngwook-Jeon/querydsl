package com.young.querydsl.repository;

import com.young.querydsl.dto.MemberSearchCondition;
import com.young.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
