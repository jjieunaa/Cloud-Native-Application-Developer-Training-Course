package kr.kwangan2.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.kwangan2.security.domain.CustomUser;
import kr.kwangan2.security.domain.MemberVO;
import kr.kwangan2.security.mapper.MemberMapper;
import lombok.Setter;

public class CustomUserDetailsService implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MemberVO vo = memberMapper.read(username);
		return vo == null ? null : new CustomUser(vo);
	}

}
