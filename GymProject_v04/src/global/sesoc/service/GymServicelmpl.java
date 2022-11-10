package global.sesoc.service;

import java.util.ArrayList;
import java.util.List;

import global.sesoc.vo.GymVO;

public class GymServicelmpl implements GymService {
	List<GymVO> list = new ArrayList<>();
	@Override
	public boolean insert(GymVO vo) {
		return list.add(vo);
		
	}

	@Override
	public GymVO selectOne(String id) {
		for(int i = 0; i<list.size(); ++i) {
			GymVO vo = list.get(i);
			if(list.get(i).getUsrid().equals(id)) {
				return list.get(i); // 해당회원 리턴
			}
		}
		return null; // 회원이 없으먄 null
	}

	@Override
	public boolean update(GymVO vo) {
		for(int i = 0; i<list.size(); ++i) {
			if(list.get(i).getUsrid().equals(vo.getUsrid())) {
				list.get(i).setHeight(vo.getHeight());
				list.get(i).setWeight(vo.getWeight());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		for(int i = 0; i<list.size(); ++i) {
			GymVO vo = list.get(i);
			if(list.get(i).getUsrid().equals(id)) {
				list.remove(i);//리스트값을 받아서 지운다
				return true ;
			}
		}
		return false;
	}

	@Override
	public List<GymVO> selectAll() {
		// TODO Auto-generated method stub
		return list;
	}

}
