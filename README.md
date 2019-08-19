## Usage
### 1.Import to your project
    Add it in your root build.gradle at the end of repositories:

	Step 1.
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.mhtparyani:FilePicker:-1.0.0'
	}
    
### 2.Start Activity For Result
    case R.id.btn_pick_image:
		Intent intent1 = new Intent(this, ImagePickActivity.class);
		intent1.putExtra(IS_NEED_CAMERA, true);
		intent1.putExtra(Constant.MAX_NUMBER, 9);
		startActivityForResult(intent1, Constant.REQUEST_CODE_PICK_IMAGE);
		break;
	case R.id.btn_pick_video:
		intent2 = new Intent(this, VideoPickActivity.class);
		intent2.putExtra(IS_NEED_CAMERA, true);
		intent2.putExtra(Constant.MAX_NUMBER, 9);
		startActivityForResult(intent2, Constant.REQUEST_CODE_PICK_VIDEO);
		break;
	case R.id.btn_pick_audio:
		Intent intent3 = new Intent(this, AudioPickActivity.class);
		intent3.putExtra(IS_NEED_RECORDER, true);
		intent3.putExtra(Constant.MAX_NUMBER, 9);
		startActivityForResult(intent3, Constant.REQUEST_CODE_PICK_AUDIO);
		break;
	case R.id.btn_pick_file:
		Intent intent4 = new Intent(this, NormalFilePickActivity.class);
		intent4.putExtra(Constant.MAX_NUMBER, 9);
		intent4.putExtra(NormalFilePickActivity.SUFFIX, new String[] {"xlsx", "xls", "doc", "docx", "ppt", "pptx", "pdf"});
		startActivityForResult(intent4, Constant.REQUEST_CODE_PICK_FILE);
		break;
		
### 3.Receive the Result from Activity
    case Constant.REQUEST_CODE_PICK_IMAGE:
		if (resultCode == RESULT_OK) {
            ArrayList<ImageFile> list = data.getParcelableArrayListExtra(Constant.RESULT_PICK_IMAGE);
        }
        break;
	case Constant.REQUEST_CODE_PICK_VIDEO:
		if (resultCode == RESULT_OK) {
            ArrayList<VideoFile> list = data.getParcelableArrayListExtra(Constant.RESULT_PICK_VIDEO);
        }
        break;
    case Constant.REQUEST_CODE_PICK_AUDIO:
		if (resultCode == RESULT_OK) {
            ArrayList<AudioFile> list = data.getParcelableArrayListExtra(Constant.RESULT_PICK_AUDIO);
        }
        break;
	case Constant.REQUEST_CODE_PICK_FILE:
		if (resultCode == RESULT_OK) {
            ArrayList<NormalFile> list = data.getParcelableArrayListExtra(Constant.RESULT_PICK_FILE);
        }
        break;

